SUMMARY = "C++ header-only library for CSV parsing"
DESCRIPTION = "Rapidcsv is a C++ header-only library for CSV parsing. \
It targets rapid development rather than rapid parsing."
LICENSE = "BSD-3-Clause"

PV = "8.99"

RPM_NAME = "rapidcsv-devel-8.99-1.3.noarch.rpm"
RPM_HASH = "e77bde3852daa2949f1b7914be96a7c354c51ca9539586b593d670cbc388ab3cd2cb4ef9d120c0adb76a7dba9c5ace759be76fe9a5713d46be34b9235b859e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-rapidcsv \
rapidcsv-devel"

RDEPENDS:${PN} += ""

inherit rpm
