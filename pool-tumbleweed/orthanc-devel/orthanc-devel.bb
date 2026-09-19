SUMMARY = "Header and source files for creating Orthanc plugins"
DESCRIPTION = "This package includes the header files to develop C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.13.0"

RPM_NAME = "orthanc-devel-1.13.0-1.2.noarch.rpm"
RPM_HASH = "70d68a2bf93930a0fc6704a632e4357c941a2d895b04870881252f5f365b057eb1c1248994f0b990aa60500c670741a489bc1bece24bbca676c20e74a0d4db99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-devel \
orthanc-static"

RDEPENDS:${PN} += ""

inherit rpm
