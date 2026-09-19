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

RPM_NAME = "python314-ipython-pygments-lexers-1.1.1-1.4.noarch.rpm"
RPM_HASH = "60d50338c47bee3a8fa16ac5710d55b08bd305364c72b86923629bf23918ca8546b3c3fd27150051c17ef6d099e410a64c669dfb1ebc4373e8bf06b167cff536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipython-pygments-lexers \
python314-ipython-pygments-lexers \
python3dist-ipython-pygments-lexers"

RDEPENDS:${PN} += "python-abi \
python314-pygments"

inherit rpm
