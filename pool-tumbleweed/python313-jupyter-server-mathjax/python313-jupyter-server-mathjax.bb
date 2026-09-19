SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python313-jupyter-server-mathjax-0.2.6-4.5.noarch.rpm"
RPM_HASH = "576193a8022cd7abf05d618d1d7c8ff7d1e5d71180b31a5becd014eb2cba09d962256c7546b0c9ad01b236b51066ee9e3b52ccc8eb9e03ea0c8452d59dc20e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-mathjax \
python3.13dist-jupyter-server-mathjax \
python313-jupyter-server-mathjax \
python3dist-jupyter-server-mathjax"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python-abi \
python313-jupyter-server"

inherit rpm
