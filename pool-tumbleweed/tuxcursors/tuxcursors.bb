SUMMARY = "Tux Cursors!"
DESCRIPTION = "A cursor set that has nice animated penguins."
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "tuxcursors-0.5-88.9.noarch.rpm"
RPM_HASH = "0dc1acf8fa870de75a78eb01644d54f25615d473ab0e24ef1e79b469ab6381c06b46f40847b1940d84015da498d6cdf7b1cee8a39844f81dc41793c84fee4301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxcursors"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
