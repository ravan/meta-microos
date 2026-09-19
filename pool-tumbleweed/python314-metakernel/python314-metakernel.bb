SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python314-metakernel-1.0.0-1.2.noarch.rpm"
RPM_HASH = "53bb7d6ff99af9b777171c891b262ecdf43967c087c993a1aac40f1dae34c571e8898973f9d0fc7311c9be00f2b335a171d7a1b8be1c9c3ed2899b89134939a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-metakernel \
python314-jupyter-metakernel \
python314-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python314-comm \
python314-ipykernel \
python314-jedi \
python314-jupyter-core \
python314-pexpect"

inherit rpm
