SUMMARY = "Dynamic tagging library for awesome"
DESCRIPTION = "Shifty is an Awesome 3 extension that implements dynamic tagging. It also \
implements fine client matching configuration allowing YOU to be the master \
of YOUR desktop only by setting two simple config variables and some \
keybindings! Here are a few ways of how shifty makes awesome awesomer: \
 \
- on-the-fly tag creation and disposal \
- advanced client matching \
- easy moving of clients between tags \
- tag add/rename prompt in taglist (with completion, now configurable NEW ) \
- reordering tags and configurable positioning \
- tag name guessing, automagic no-config client grouping \
- customizable keybindings per client and tag -- NEW \
- simple yet powerful configuration"
LICENSE = "GPL-2.0+"

PV = "git20140405"

RPM_NAME = "awesome-shifty-git20140405-1.24.noarch.rpm"
RPM_HASH = "7833e830723aa1905d1d6656e54cc292978ad965ff21064625a13e81f0e8ffcc750fea8acd44f33d1a2350f204ffacbd27031deca878d08441645085cbcc6da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-shifty"

RDEPENDS:${PN} += "awesome"

inherit rpm
