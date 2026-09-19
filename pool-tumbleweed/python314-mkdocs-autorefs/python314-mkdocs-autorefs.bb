SUMMARY = "Automatically link across pages in MkDocs"
DESCRIPTION = "Automatically link across pages in MkDocs."
LICENSE = "ISC"

PV = "1.4.4"

RPM_NAME = "python314-mkdocs-autorefs-1.4.4-1.2.noarch.rpm"
RPM_HASH = "13c0a20fcb85793f65a9b90b5f88add2d5cc4d0d20edb15bb63895ddc71ec63ff09d8fda5f9cb947a874021063dca1f10814374f6e6e15e5aa531dd5aac48c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs-autorefs \
python314-mkdocs-autorefs \
python3dist-mkdocs-autorefs"

RDEPENDS:${PN} += "python-abi \
python314-Markdown \
python314-MarkupSafe \
python314-mkdocs"

inherit rpm
