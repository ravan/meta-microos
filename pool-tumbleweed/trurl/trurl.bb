SUMMARY = "Command line tool for URL parsing and manipulation"
DESCRIPTION = "A CLI tool that parses and manipulates URLs, designed to help \
shell script authors everywhere."
LICENSE = "curl"

PV = "0.16.1"

RPM_NAME = "trurl-0.16.1-4.3.aarch64.rpm"
RPM_HASH = "cbb2c7167d31471432c5be54ecc5421c8ca7e8cb8021733620e41a8fdac91c3a6f7cb8a63238adf646d2a5fbce4da9e282bb0d45b59e678dff79785d13878886"

RPROVIDES:${PN} += "trurl"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4"

inherit rpm
