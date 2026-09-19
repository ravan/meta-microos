SUMMARY = "Wrapper around terminal styling, screen positioning, and keyboard input"
DESCRIPTION = "Blessed is a thin, practical wrapper around terminal capabilities in Python. \
*Blessed* is a more simplified wrapper around curses, providing : \
 \
* Styles, color, and maybe a little positioning without necessarily \
  clearing the whole screen first. \
* Works great with standard Python string formatting. \
* Provides up-to-the-moment terminal height and width, so you can respond to \
  terminal size changes. \
* Avoids making a mess if the output gets piped to a non-terminal: \
  outputs to any file-like object such as *StringIO*, files, or pipes. \
* Uses the `terminfo(5)`_ database so it works with any terminal type \
  and supports any terminal capability: No more C-like calls to tigetstr_ \
  and tparm_. \
* Keeps a minimum of internal state, so you can feel free to mix and match with \
  calls to curses or whatever other terminal libraries you like. \
* Provides plenty of context managers to safely express terminal modes, \
  automatically restoring the terminal to a safe state on exit. \
* Act intelligently when somebody redirects your output to a file, omitting \
  all of the terminal sequences such as styling, colors, or positioning. \
* Dead-simple keyboard handling: safely decoding unicode input in your \
  system's preferred locale and supports application/arrow keys. \
* Allows the printable length of strings containing sequences to be \
  determined. \
 \
Blessed **does not** provide... \
 \
* Windows command prompt support.  A PDCurses_ build of python for windows \
  provides only partial support at this time -- there are plans to merge with \
  the ansi module in concert with colorama to resolve this."
LICENSE = "MIT"

PV = "1.38.0"

RPM_NAME = "python314-blessed-1.38.0-1.2.noarch.rpm"
RPM_HASH = "f867d858f798a5967f956a064e3f9d4077e95e12b819ccc28fb6c291dccc12bdd38313f96b474ed20bc8b82004d2eefc2dabd8a200e86dc72e0d1e164c463ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blessed \
python314-blessed \
python3dist-blessed"

RDEPENDS:${PN} += "python-abi \
python314-curses \
python314-wcwidth"

inherit rpm
