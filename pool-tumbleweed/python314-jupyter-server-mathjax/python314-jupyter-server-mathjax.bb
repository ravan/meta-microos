SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python314-jupyter-server-mathjax-0.2.6-4.5.noarch.rpm"
RPM_HASH = "8d44ff5527a7186e9ac534f0bc83f80910673cb2596d6d6b47aaca697f26c2eaf233cfda9b0d9b8e974518ebe8cd4298100d1f315e580cfff1d78c134541b960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-server-mathjax \
python314-jupyter-server-mathjax \
python3dist-jupyter-server-mathjax"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python-abi \
python314-jupyter-server"

inherit rpm
