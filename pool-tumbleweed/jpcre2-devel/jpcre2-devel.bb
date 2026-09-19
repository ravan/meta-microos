SUMMARY = "C++ wrapper for the PCRE2 library (header only)"
DESCRIPTION = "C++ wrapper for PCRE2 library (header only). \
Provides some C++ wrapper classes/functions to perform regex operations \
such as regex match and regex replace."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "10.32.01"

RPM_NAME = "jpcre2-devel-10.32.01-1.16.aarch64.rpm"
RPM_HASH = "c8cd2b56a5f94660a99dbcac95995ea66deb2bf2972f51d7c95e2c47519f242b7b1cc7f666ea5d3de756009f2adb764fa1a34c2957dc398475d08f0c77d388a9"

RPROVIDES:${PN} += "jpcre2-devel"

RDEPENDS:${PN} += ""

inherit rpm
