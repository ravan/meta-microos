SUMMARY = "VM - a mail reader for GNU Emacs"
DESCRIPTION = "VM (View Mail) is an Emacs subsystem that allows UNIX mail to be read \
and disposed of within Emacs.  Commands exist to do the normal things \
expected of a mail user agent, such as generating replies, saving \
messages to folders, deleting messages and so on.  There are other more \
advanced commands that do tasks like bursting and creating digests, \
message forwarding, and organizing message presentation according to \
various criteria."
LICENSE = "GPL-2.0+"

PV = "8.2.0b.1538"

RPM_NAME = "emacs-vm-8.2.0b.1538-1.14.aarch64.rpm"
RPM_HASH = "c340ae234ea0057a81c3c04666ed827031b757c7dd7a99c3757d5ac93dbca74642405475867a04fc5a020290caa92b06a2c87ef0f3a78011f9bb5488009f72b9"

RPROVIDES:${PN} += "emacs-vm"

RDEPENDS:${PN} += "ed \
emacs \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
