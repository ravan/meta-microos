SUMMARY = "Fish completion for SwayNotificationCenter"
DESCRIPTION = "Fish command line completion support for SwayNotificationCenter"
LICENSE = "GPL-3.0-only"

PV = "0.12.6"

RPM_NAME = "SwayNotificationCenter-fish-completion-0.12.6-1.3.noarch.rpm"
RPM_HASH = "8bbdced19241aceeda6dd27ec6de0709f19470db9f9716e0209fdf1a577d371af17c66aaa09f0bd4483c3d7f32c5edec5a64d697774cdb1797f3217bfd7589e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SwayNotificationCenter-fish-completion \
swaync-fish-completion"

RDEPENDS:${PN} += "SwayNotificationCenter \
fish"

inherit rpm
