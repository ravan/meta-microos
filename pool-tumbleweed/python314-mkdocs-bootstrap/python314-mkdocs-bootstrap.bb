SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python314-mkdocs-bootstrap-1.1.1-2.5.noarch.rpm"
RPM_HASH = "8979cdc11898f40f19c964ef15ba1c3741068d4de035186f1ffe486bed9a647c0a0266bc75f2df87ae62fd938bfd61cf4572eeafcb99fb94dd31421b6fae293f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs-bootstrap \
python314-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python314-mkdocs"

inherit rpm
