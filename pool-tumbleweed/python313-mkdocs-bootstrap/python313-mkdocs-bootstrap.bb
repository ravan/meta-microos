SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python313-mkdocs-bootstrap-1.1.1-2.5.noarch.rpm"
RPM_HASH = "6e04deceddc7a840d97c3d0558b361af14d73c0d1d344462f244730583513dc55f50312c344d431fc744db6231e52a3c60efd3f418b3d3fc74c75ec2ae465e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-bootstrap \
python3.13dist-mkdocs-bootstrap \
python313-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python313-mkdocs"

inherit rpm
