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

RPM_NAME = "python314-py3status-3.61-1.6.noarch.rpm"
RPM_HASH = "a42ee39fc817110dd49ba6899112c19d51351aa43df12070c98fb76b654cb5fe528bbd4989a0f5034557c26d85045a123dc26280f2e916ba8957f902bcd012f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3status \
python3.14dist-py3status \
python314-py3status \
python3dist-py3status"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
