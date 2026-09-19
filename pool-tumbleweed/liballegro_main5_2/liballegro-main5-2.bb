SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_main5_2-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "dc0067acc64185ac11d0a7bd705ffd2430c71d4d42513c3cbfa164319f4397d95471fc1a9cda52326effc89295b9cf5ca8a17bec19b8caf84a24460dc7c1a0c8"

RPROVIDES:${PN} += "liballegro-main.so.5.2 \
liballegro-main5-2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
