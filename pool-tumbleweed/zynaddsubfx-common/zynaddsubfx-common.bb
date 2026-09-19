SUMMARY = "Common files for ZynAddSubFX synthesizers"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
These are files common to the gui and dssi,lv2 and vst plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-common-3.0.6-4.4.noarch.rpm"
RPM_HASH = "9041e240db0d1aecf15f1268da48c66555968ebeddd12313b6878489e4ff76f3b1bf2fa8fa04c4b6da14deb487840cba43d8a4cd61c07d77ea3fda884254372d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ZynAddSubFX-common \
zynaddsubfx-common"

RDEPENDS:${PN} += ""

inherit rpm
