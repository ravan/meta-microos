SUMMARY = "A Super Mario Brothers Fan game engine (SMBX)"
DESCRIPTION = "TheXTech is a free and open-source game engine for Mario-like \
platforming games. There is a complete and extended source code \
port of the Super Mario Bros. X 1.3 game engine (later just 'SMBX'), \
and its direct unofficial continuation after development halted in \
the 2011th year. This engine preserves full compatibility with \
levels and episodes made for the original SMBX game, including its \
repacks. And it's allowed to create brand-new Levels, Episodes, \
and content packs. Unlike the original SMBX game that depends on \
Windows and x86, TheXTech can work on many operating systems \
(including Linux distros, macOS, xBSD, Android, Haiku, etc.) and \
processor architectures (including x86_64, ARM, PowerPC, MIPS, etc.). \
 \
Note: \
This package contain the runtime engine binary only, \
*no game assets included*. \
 \
See the following links on how to install game assets: \
https://github.com/TheXTech/TheXTech/wiki/Game-assets-packages \
https://github.com/TheXTech/TheXTech/wiki/Running-game-assets-on-Linux-or-xBSD"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.7.3.1"

RPM_NAME = "thextech-1.3.7.3.1-1.2.aarch64.rpm"
RPM_HASH = "f7cd3da56c2d022bf3275195af81a557f2ab23266680deed4076199f09c9a12d61008fc86958d814360355a08de97ff02734fb4206d0a434fddacb6fbaec2877"

RPROVIDES:${PN} += "bundled-AudioCodecs \
bundled-DirManager \
bundled-FileMapper \
bundled-FreeImageLite \
bundled-IniProcessor \
bundled-LuaJIT \
bundled-PGE-File-Formats \
bundled-SDL-Mixer-X \
bundled-SDL-net \
bundled-freetype \
bundled-hextech-discord-rpc \
bundled-luabind \
bundled-luau \
bundled-mbediso \
thextech"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
