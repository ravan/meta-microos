SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python314-sphinx-removed-in-0.2.3-1.9.noarch.rpm"
RPM_HASH = "34489e9efb812347c9dcae907095d8086325f0373ad5360ffef6da165204b631a8d981dc88c09d4604ad165a73449703d0237ae7a6b98174ee937b0612904686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-removed-in \
python314-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
