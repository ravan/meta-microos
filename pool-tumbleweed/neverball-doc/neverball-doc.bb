SUMMARY = "Documentation for the neverball"
DESCRIPTION = "Tilt the floor to roll a ball through an obstacle course within the \
given time. If the ball falls or time expires, a ball is lost. \
 \
Collect 100 coins to save your progress and earn an extra ball. \
Red coins are worth 5. Blue coins are worth 10. \
 \
In the grand tradition of Marble Madness and Super Monkey Ball, \
Neverball has you guide a rolling ball through dangerous territory. \
Balance on narrow bridges, navigate mazes, ride moving platforms, \
and dodge pushers and shovers to get to the goal. \
Race against the clock to collect coins to earn extra balls. \
 \
Documentation for the neverball."
LICENSE = "GPL-2.0-or-later"

PV = "1.6+git.20240820"

RPM_NAME = "neverball-doc-1.6+git.20240820-1.2.noarch.rpm"
RPM_HASH = "81f33db7c5fe2ce8556595b890fdff267670f5dbf0b33c51f8519dae5afa59556e38d7e60118c93374224114ec9f8129799bd5968bc629e1ef0246d52e22255d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neverball-doc"

RDEPENDS:${PN} += ""

inherit rpm
