SUMMARY = "Extension for rxvt-unicode that allows changing the font size on the fly"
DESCRIPTION = "A perl extension for rxvt-unicode that allows changing the font size on the fly \
with keyboard shortcuts. It has the following features: \
 - Supports both xft and X11 fonts; X11 fonts work in both full form and as \
   aliases. \
 - Supports all four font settings: font, boldFont, italicFont and \
   boldItalicFont and changes them in accordance with the base font (the first \
   one from font). \
 - Can apply the font change globally for the whole server, so that new \
   terminals will inherit the same size, and even save it to ~/.Xresources to \
   be able to survive a reboot. \
 - Should work even with complicated font setups like the example in the urxvt \
   man-page."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "urxvt-font-size-1.3-1.12.aarch64.rpm"
RPM_HASH = "5e9172e3b681c97114f2b239af75bb5528f8a3c1d49462feced36434836c7d1861cb607f86c7a7571f5b18c4749fe9c5a4dcd7ff9bc2338420ef86fa748fbf05"

RPROVIDES:${PN} += "urxvt-font-size"

RDEPENDS:${PN} += ""

inherit rpm
