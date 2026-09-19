SUMMARY = "Kirghiz (Кыргызча) Dictionary for Aspell"
DESCRIPTION = "A Kirghiz (Кыргызча) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.0"

RPM_NAME = "aspell-ky-0.01.0-4.7.aarch64.rpm"
RPM_HASH = "25652ac0440f61d1334fb134afa4a6ad261ef6049a29d2395aa08c4079a7d9c23cbf35187164d5da58fd3debf62c356f0f87be4a20c6fee2691a507ae4494ece"

RPROVIDES:${PN} += "aspell-ky \
locale-aspell-ky"

RDEPENDS:${PN} += ""

inherit rpm
