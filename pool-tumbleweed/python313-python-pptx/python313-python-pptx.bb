SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Create, read, and update PowerPoint 2007+ (.pptx) files."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-python-pptx-1.0.2-2.4.noarch.rpm"
RPM_HASH = "21db3193c41eeba66aa8f889957b84a1c5a78b61b1485371a178c22d52c7a1e473880267d9b2118cac1a386eccebc46f91f4744f4a019474b872d6c9775f5714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pptx \
python3.13dist-python-pptx \
python313-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-XlsxWriter \
python313-lxml \
python313-typing-extensions"

inherit rpm
