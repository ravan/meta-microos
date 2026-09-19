SUMMARY = "Pygments lexers for highlighting IPython code"
DESCRIPTION = "A Pygments plugin for IPython code & console sessions \
 \
IPython is an interactive Python shell. Among other features, \
it adds some special convenience syntax, including `%magics`, `!shell commands` \
and `help?`. This package contains lexers for these, to use with the Pygments syntax \
highlighting package. \
 \
- The `ipython` lexer should be used where only input code is highlighted \
- The `ipythonconsole` lexer works for an IPython session, including code, \
  prompts, output and tracebacks. \
 \
These lexers were previously part of IPython itself (in `IPython.lib.lexers`), \
but have now been moved to a separate package."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python313-ipython-pygments-lexers-1.1.1-1.4.noarch.rpm"
RPM_HASH = "3bb089d5ea1ecee99adf59db0ad6de05c77528128701368d921ae0bf6f30833937346c4f920a07296bd9e9614113fb37404f3fe50397dcad3b10e24c8f54ca97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipython-pygments-lexers \
python3.13dist-ipython-pygments-lexers \
python313-ipython-pygments-lexers \
python3dist-ipython-pygments-lexers"

RDEPENDS:${PN} += "python-abi \
python313-pygments"

inherit rpm
