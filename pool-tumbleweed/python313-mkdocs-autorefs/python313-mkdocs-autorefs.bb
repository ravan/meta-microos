SUMMARY = "Automatically link across pages in MkDocs"
DESCRIPTION = "Automatically link across pages in MkDocs."
LICENSE = "ISC"

PV = "1.4.4"

RPM_NAME = "python313-mkdocs-autorefs-1.4.4-1.2.noarch.rpm"
RPM_HASH = "a88cec899069793a9fc9e53a3eeca11d99707c9e6b2e1d9e4fa1f95d3dfc953e4be9464ae1958bc6c73235659bb85040a2988e8cad1cb7e15444fdf04de2f547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-autorefs \
python3.13dist-mkdocs-autorefs \
python313-mkdocs-autorefs \
python3dist-mkdocs-autorefs"

RDEPENDS:${PN} += "python-abi \
python313-Markdown \
python313-MarkupSafe \
python313-mkdocs"

inherit rpm
