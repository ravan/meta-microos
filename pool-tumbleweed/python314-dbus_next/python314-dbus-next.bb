SUMMARY = "A zero-dependency DBus library for Python with asyncio support"
DESCRIPTION = "python-dbus-next is a Python library for DBus that aims to be a fully featured high level library primarily geared towards integration of applications into Linux desktop and mobile environments. \
 \
Desktop application developers can use this library for integrating their applications into desktop environments by implementing common DBus standard interfaces or creating custom plugin interfaces. \
 \
Desktop users can use this library to create their own scripts and utilities to interact with those interfaces for customization of their desktop environment. \
 \
python-dbus-next plans to improve over other DBus libraries for Python in the following ways: \
 \
Zero dependencies and pure Python 3. \
Support for multiple IO backends including asyncio and the GLib main loop. \
Nonblocking IO suitable for GUI development. \
Target the latest language features of Python for beautiful services and clients. \
Complete implementation of the DBus type system without ever guessing types. \
Integration tests for all features of the library. \
Completely documented public API."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-dbus_next-0.2.3-2.5.noarch.rpm"
RPM_HASH = "85edffba524b2d85bc817f7d902dd92050575ed15e17e98de4d0fc8178089d63b338f88d1fdff4d1850785ad7a050f671261bd3598a04e8ce0b048d8f8193c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dbus-next \
python314-dbus-next \
python3dist-dbus-next"

RDEPENDS:${PN} += "python-abi"

inherit rpm
