SUMMARY = "Open Object REXX"
DESCRIPTION = "Open Object Rexx is an object-oriented scripting language. The language is designed for both beginners and experienced Rexx programmers. It is easy to learn and use, and provides an excellent vehicle to enter the \
world of object-oriented programming without much effort. \
 \
It extends the procedural way of Rexx programming with object-oriented features that allow you to gradually change your programming style as you learn more about objects. \
 \
For more information on ooRexx, visit http://www.oorexx.org/ \
For more information on Rexx, visit http://www.rexxla.org/"
LICENSE = "CPL-1.0"

PV = "5.2.0"

RPM_NAME = "ooRexx-5.2.0-2.1.aarch64.rpm"
RPM_HASH = "f8500a98c03b1b6c9e34d242ede0f2aeea7404fc3d7b571c88957100f2ef696c1e48813604a9c50e08ce5e158958a806b2a29018e8c95d958ce0bd881f38e4e6"

RPROVIDES:${PN} += "ooRexx"

RDEPENDS:${PN} += "alts \
libc.so.6 \
libgcc-s.so.1 \
liboorexx4 \
librexx.so.4 \
librexxapi.so.4 \
libstdc++.so.6"

inherit rpm
