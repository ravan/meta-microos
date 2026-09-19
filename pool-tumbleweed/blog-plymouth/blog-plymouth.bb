SUMMARY = "Replaces plymouth by blogd"
DESCRIPTION = "The Blogd daemon can be used as a replacement for Plymouth in situations where \
a splash screen and/or usage of a frame buffer is unwanted.  The Blogd is also \
a Plymouth agent. That means, it can handle requests for a password prompt by \
the system password service of systemd. \
The blogd daemon writes out boot log messages to every terminal device used by \
/dev/console and to the log file /var/log/boot.log.  When halting or rebooting \
the system, it moves the log file to /var/log/boot.old and appends all log \
messages upto to point at which the file systems becomes unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "2.48"

RPM_NAME = "blog-plymouth-2.48-1.1.noarch.rpm"
RPM_HASH = "659c1b26bd811824e8b6784d111cde99ec83c0a0340da3ec1d8187730b2398aab265096e4de2783ad3bc14fab7027ff75fd2e1ecb3a68bcfecabd70067932c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blog-plymouth"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
blog \
systemd \
udev"

inherit rpm
