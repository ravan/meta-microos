SUMMARY = "A templating system for Python"
DESCRIPTION = "EmPy is a system for embedding Python expressions and statements \
in template text; it takes an EmPy source file, processes it, and \
produces output.  This is accomplished via expansions, which are \
special signals to the EmPy system and are set off by a special \
prefix (by default the at sign, '@').  EmPy can expand arbitrary \
Python expressions and statements in this way, as well as a \
variety of special forms.  Textual data not explicitly delimited \
in this way is sent unaffected to the output, allowing Python to \
be used in effect as a markup language.  Also supported are 'hook' \
callbacks, recording and playback via diversions, and dynamic, \
chainable filters.  The system is highly configurable via command \
line options and embedded commands."
LICENSE = "BSD-3-Clause"

PV = "4.2.1"

RPM_NAME = "python314-empy-4.2.1-1.4.noarch.rpm"
RPM_HASH = "15440a6c773d4229a39fede9b573a6932a2e56c6f74da4347f287cfe56f5ed2e74d9432c0519b7fc1ad07702b289156fe2e22b9f81411e91e767d335cfc604e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-empy \
python314-empy \
python3dist-empy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
