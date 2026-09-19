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

RPM_NAME = "python314-ipython-9.10.0-1.4.noarch.rpm"
RPM_HASH = "f68834a0e134da824a4cdbfebd7d10d37fae2a9c7a7566900ef85f4089aba65d1306d0ff633936cd479ca228eecd256cee958eaf8f6fcbf4d521941640344ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 \
jupyter-ipython \
python3.14dist-ipython \
python314-IPython \
python314-ipython \
python314-ipython-doc \
python314-jupyter-ipython \
python314-jupyter-ipython-doc \
python314-jupyter-ipython-doc-html \
python314-jupyter-ipython-doc-pdf \
python3dist-ipython"

RDEPENDS:${PN} += "-python314-prompt-toolkit >= 3.0.41 with python314-prompt-toolkit < 3.1 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-decorator \
python314-ipython-pygments-lexers \
python314-jedi \
python314-matplotlib-inline \
python314-pexpect \
python314-pygments \
python314-stack-data \
python314-traitlets"

inherit rpm
