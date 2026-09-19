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

RPM_NAME = "python313-empy-4.2.1-1.4.noarch.rpm"
RPM_HASH = "9dc582bce6f8c6534f617a41b49c881cb220a71c77f9a2a5acd443db2b0d472bfb54f91ef4423b5bf6f2f0de02d72d21143fdede1913f4bc0ccd900caef99a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-empy \
python3.13dist-empy \
python313-empy \
python3dist-empy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
