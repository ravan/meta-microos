SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python313-jupyter_console-6.6.3-3.7.noarch.rpm"
RPM_HASH = "963ee77ed51d86425000caa9e1611144382f86282b56b3a1db48bb90d6260c89b213940618de300f7aac3a94d4d3dcd1dd66e79841952962fc123d14a10512bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-console \
jupyter-jupyter-console-doc \
python3-jupyter-console \
python3.13dist-jupyter-console \
python313-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
jupyter-jupyter-console \
python-abi \
python313-Pygments \
python313-ipykernel \
python313-ipython \
python313-jupyter-client \
python313-prompt-toolkit \
python313-pyzmq \
python313-traitlets \
update-alternatives"

inherit rpm
