SUMMARY = "Status line and prompt utility"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and prompts \
for several other applications, including zsh, bash, tmux, IPython, Awesome and \
Qtile."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "powerline-2.8.4-3.5.aarch64.rpm"
RPM_HASH = "b8164562e913651d956969c2ba599eb5adbc428c925375ee26ce0c2a897f5057e7e91c2f1af65eaa604784cf5ccef5edf583e87d94b9397bf04466135d000a79"

RPROVIDES:${PN} += "config-powerline \
powerline \
python3-powerline-status \
python3.13dist-powerline-status \
python3dist-powerline-status"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
powerline-fonts \
python-abi \
python3 \
python3-psutil \
systemd"

inherit rpm
