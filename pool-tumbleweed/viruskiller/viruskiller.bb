SUMMARY = "Arcade shoot 'em up game about virus invasion"
DESCRIPTION = "Your computer has been invaded! Dozens of little viruses are pouring \
in via security holes in Microsoft Internet Explorer, Microsoft Outlook, \
Microsoft MSN Messenger and Microsoft Recycle Bin!! Using your trusty \
mouse you must shoot the buggers before they can destroy your files! \
Some will steal them from their home directories and take them back \
to their security hole. Others will just eat them right there on \
the spot! See how long you and your computer can survive the onslaught!"
LICENSE = "GPL-2.0+"

PV = "1.03"

RPM_NAME = "viruskiller-1.03-3.9.aarch64.rpm"
RPM_HASH = "9981f74f769def629b8f147534f38a6cd92b2ccb00f76068fd69144cea72e78f772587df8d5c28f6c56bcd2bec45b81023c107851a18593c555cd0d3e5012e5b"

RPROVIDES:${PN} += "viruskiller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-net-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
