SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python313-rich-15.0.0-3.1.noarch.rpm"
RPM_HASH = "c1c6731f2ba6a241796ccb65b7495a4f39cf44c0a6dad1beaedbbe1490d58d900da183a0b2ed2971fe103727a725b4222b1cebddb0aee4dd1ddf9cee7b3e7b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich \
python3.13dist-rich \
python313-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python313-markdown-it-py \
python313-pygments"

inherit rpm
