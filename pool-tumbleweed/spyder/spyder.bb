SUMMARY = "The Scientific Python Development Environment"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
It features a combination of the editing, analysis, debugging \
and profiling functionality of a development tool with the \
data exploration, interactive execution, deep inspection and \
visualization capabilities of an analysis package. Additionally, \
Spyder offers built-in integration with scientific \
libraries, including NumPy, SciPy, Pandas, IPython, QtConsole, \
Matplotlib, SymPy, and more, and can be extended further with \
full plugin support."
LICENSE = "MIT"

PV = "6.1.5"

RPM_NAME = "spyder-6.1.5-1.2.noarch.rpm"
RPM_HASH = "cc7228feaf6bb053ab4d8383f5aed1157d8e25cf9614d082458c1da31d43f79bc4f35ee8ed993c11dbc2abc530161d564da3a932965eb7ffc7b29fb5f290686f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder \
python3-spyderlib \
python3.13dist-spyder \
python3dist-spyder \
spyder \
spyder3 \
spyder3-breakpoints \
spyder3-profiler \
spyder3-pylint"

RDEPENDS:${PN} += "-python3-QDarkStyle >= 3.2.0 with python3-QDarkStyle < 3.3.0 \
-python3-QtAwesome >= 1.4.1 with python3-QtAwesome < 1.5 \
-python3-asyncssh >= 2.14 with python3-asyncssh < 3 \
-python3-ipython >= 8.15 with python3-ipython < 10 \
-python3-parso >= 0.7.0 with python3-parso < 0.9.0 \
-python3-pylint >= 3.1 with python3-pylint < 5 \
-python3-python-lsp-black >= 2.0.0 with python3-python-lsp-black < 3 \
-python3-python-lsp-ruff >= 2.3.0 with python3-python-lsp-ruff < 3 \
-python3-python-lsp-server-all >= 1.14.0 with python3-python-lsp-server-all < 1.15 \
-python3-qtconsole >= 5.7.2 with python3-qtconsole < 5.8.0 \
-python3-spyder-kernels >= 3.1.4 with python3-spyder-kernels < 3.2 \
-python3-superqt >= 0.6.2 with python3-superqt < 1 \
/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-PyQt6 \
python3-PyQt6-WebEngine \
python3-Pygments \
python3-QtPy \
python3-Rtree \
python3-Sphinx \
python3-aiohttp \
python3-atomicwrites \
python3-bcrypt \
python3-chardet \
python3-cloudpickle \
python3-cookiecutter \
python3-diff-match-patch \
python3-importlib-metadata \
python3-intervaltree \
python3-ipython-pygments-lexers \
python3-jedi \
python3-jellyfish \
python3-jsonschema \
python3-keyring \
python3-nbconvert \
python3-numpydoc \
python3-packaging \
python3-pexpect \
python3-pickleshare \
python3-psutil \
python3-pygithub \
python3-pylint-venv \
python3-pyls-spyder \
python3-pyuca \
python3-pyxdg \
python3-pyzmq \
python3-qstylizer \
python3-textdistance \
python3-three-merge \
python3-watchdog \
python3-yarl \
spyder-lang"

inherit rpm
