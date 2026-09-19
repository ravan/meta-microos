SUMMARY = "Python extensible i3status wrapper"
DESCRIPTION = "py3status is an extensible i3status wrapper written in python. \
 \
Using py3status, you can take control of your i3bar easily by: \
 \
- using one of the availables modules shipped with py3status \
- writing your own modules and have their output displayed on your bar \
- handling click events on your i3bar and play with them in no time \
- seeing your clock tick every second whatever your i3status interval \
 \
py3status has a standalone mode allowing to bypass i3status when you need \
a py3status-modules-only i3bar."
LICENSE = "BSD-3-Clause"

PV = "3.61"

RPM_NAME = "python313-py3status-3.61-1.6.noarch.rpm"
RPM_HASH = "82b2aa953fc82f76f906a3d524adfddbad1601cb7852087e2d90b0f8dbe9879d9f353f25bae1361df04b80168341ec76ad5e7b4e3294722160a8c0796a141386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3-py3status \
python3.13dist-py3status \
python313-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
