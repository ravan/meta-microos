SUMMARY = "Documentation for power-profiles-daemon"
DESCRIPTION = "This package provides documentation for power-profiles-daemon."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "power-profiles-daemon-doc-0.30-1.7.noarch.rpm"
RPM_HASH = "f4595a5566869faff7fca5dbb9dd4580a3c63b53eb2d0c9b5750c7f8e8d2ad26611b0dc25e90521678c5a6c25729a4f3ea03abf4bd4ec3d498912aaa081e30a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "power-profiles-daemon-doc"

RDEPENDS:${PN} += ""

inherit rpm
