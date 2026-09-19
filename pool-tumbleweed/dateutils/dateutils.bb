SUMMARY = "Command line date and time utilities"
DESCRIPTION = "Dateutils are a bunch of tools that revolve around fiddling with dates \
and times in the command line with a strong focus on use cases that \
arise when dealing with large amounts of financial data. Their target \
market is shell scripts that need date calculations or calendar \
conversions, and as such they are highly pipe-able and modeled after \
their well-known cousins (e.g. dtest vs. test, or dgrep vs. grep)."
LICENSE = "BSD-3-Clause"

PV = "0.4.11"

RPM_NAME = "dateutils-0.4.11-1.8.aarch64.rpm"
RPM_HASH = "64488c43d23fe5b79ff4af9418de9addea7a0a9dc14c5d4f9b231b59a6e598e03f7cd98df636ad377d156fa1ec035177b4076999177894c24fd81dcfcee452ab"

RPROVIDES:${PN} += "dateutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
