SUMMARY = "Pluggable Transport using WebRTC, inspired by Flashproxy."
DESCRIPTION = "Snowflake proxy to help censored users connect to the Tor network"
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "snowflake-2.11.0-1.8.aarch64.rpm"
RPM_HASH = "5dd94f84d99d71ec2c5e23ea389e3c59ccfc0c1199b6dca00457815fcf37bffde75bf9bef5d97d9a980ff81ce29d8fc34c9546e687e6c7f052046dbaa66f51f6"

RPROVIDES:${PN} += "snowflake"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
