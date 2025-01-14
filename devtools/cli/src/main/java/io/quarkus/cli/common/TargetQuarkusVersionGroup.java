package io.quarkus.cli.common;

import picocli.CommandLine;

public class TargetQuarkusVersionGroup {

    @CommandLine.Option(paramLabel = "targetStreamId", names = { "-S",
            "--stream-id" }, description = "A target stream id, for example:%n  2.0")
    public String streamId;

    @CommandLine.Option(paramLabel = "targetPlatformVersion", names = { "-P",
            "--platform-version" }, description = "A specific target Quarkus platform version, for example:%n"
                    + "  2.2.0.Final%n")
    public String platformVersion;

    //@CommandLine.Option(names = { "-L",
    //        "--latest" }, description = "Use the latest Quarkus platform version")
    //public boolean latest;
}
