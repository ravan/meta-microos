SUMMARY = "Password generator"
DESCRIPTION = "pwgen generates random, meaningless but pronounceable and thus easy to \
remember passwords. The also contained makepasswd gives even more \
options which are more aimed at security."
LICENSE = "GPL-2.0-or-later"

PV = "2.08"

RPM_NAME = "pwgen-2.08-3.9.aarch64.rpm"
RPM_HASH = "923fff32d2b814ed8df5a83f4dc71688de059ddd0fb6798bae7e7c137c86a2e75b8a859915fea9ae51a2b98272526bcc484c42d47bee0f843d0a69459009166f"

RPROVIDES:${PN} += "pwgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
