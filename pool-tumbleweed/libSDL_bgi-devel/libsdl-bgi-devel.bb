SUMMARY = "Libraries, includes and more to develop SDL_bgi applications"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support. \
 \
Unlike other BGI-compatible libraries, the purpose of SDL_bgi is not \
full compatibility with BGI. Rather, it is meant to be an \
introduction to SDL-based graphics: SDL and BGI commands can be mixed \
together."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.2"

RPM_NAME = "libSDL_bgi-devel-3.0.2-1.7.aarch64.rpm"
RPM_HASH = "21c23c89919c6f1c0fff5e39b6a18b3058a95b8bf2e10daf89e0a2a5892f44c857879bbc5f63a604374c39059eea0dd04be0181e61cedb1011d2a6a0bbb14a03"

RPROVIDES:${PN} += "SDL-bgi-devel \
libSDL-bgi-devel"

RDEPENDS:${PN} += "libSDL-bgi-suse9"

inherit rpm
