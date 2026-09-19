SUMMARY = "Rich architecture for interactive computing with Python"
DESCRIPTION = "IPython provides a rich toolkit to help you make the \
most out of using Python interactively. Its main \
components are: \
 \
 * A powerful interactive Python shell \
 * A Jupyter kernel to work with Python code in \
   Jupyter notebooks and other interactive frontends. \
 \
The enhanced interactive Python shells have the \
following main features: \
 \
 * Comprehensive object introspection. \
 * Input history, persistent across sessions. \
 * Caching of output results during a session with automatically \
   generated references. \
 * Extensible tab completion, with support by default for completion \
   of python variables and keywords, filenames and function keywords. \
 * Extensible system of ‘magic’ commands for controlling the \
   environment and performing many tasks related either to IPython or \
   the operating system. \
 * A rich configuration system with easy switching between different \
   setups (simpler than changing $PYTHONSTARTUP environment variables \
   every time). \
 * Session logging and reloading. \
 * Extensible syntax processing for special purpose situations. \
 * Access to the system shell with user-extensible alias system. \
 * Easily embeddable in other Python programs and GUIs. \
 * Integrated access to the pdb debugger and the Python profiler."
LICENSE = "BSD-3-Clause"

PV = "9.10.0"

RPM_NAME = "python313-ipython-9.10.0-1.4.noarch.rpm"
RPM_HASH = "fd14a4d2ed263b522517abae0f7950dc2fae147104d4c86a6fcc0b7c25a833092a3d635d7967eb643fa438b621d55f9933141befe58790b2efe4f6a06642bbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 \
jupyter-ipython \
python3-IPython \
python3-ipython \
python3-ipython-doc \
python3-jupyter-ipython \
python3-jupyter-ipython-doc \
python3-jupyter-ipython-doc-html \
python3-jupyter-ipython-doc-pdf \
python3.13dist-ipython \
python313-IPython \
python313-ipython \
python313-ipython-doc \
python313-jupyter-ipython \
python313-jupyter-ipython-doc \
python313-jupyter-ipython-doc-html \
python313-jupyter-ipython-doc-pdf \
python3dist-ipython"

RDEPENDS:${PN} += "-python313-prompt-toolkit >= 3.0.41 with python313-prompt-toolkit < 3.1 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-decorator \
python313-ipython-pygments-lexers \
python313-jedi \
python313-matplotlib-inline \
python313-pexpect \
python313-pygments \
python313-stack-data \
python313-traitlets"

inherit rpm
