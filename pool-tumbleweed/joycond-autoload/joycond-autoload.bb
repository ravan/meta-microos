SUMMARY = "Configuration for autoloading extra joycond modules"
DESCRIPTION = "Configuration files to autoload optional kernel modules during \
system startup. These provide the joycond the possibility of \
signaling controller status by flashing its LEDs."
LICENSE = "GPL-3.0-or-later"

PV = "1+git20250412.39d5728"

RPM_NAME = "joycond-autoload-1+git20250412.39d5728-1.6.noarch.rpm"
RPM_HASH = "030ba25661abbd27cf8268770fcb24e005f684617eff6ec0723f4cb48ce7a7b058c8e38080ef0b2f9b1490da979c930326793dd821e3a93dee3abd2631eb6394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joycond-autoload"

RDEPENDS:${PN} += "joycond"

inherit rpm
