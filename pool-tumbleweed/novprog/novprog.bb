SUMMARY = "Wordcount graphing program"
DESCRIPTION = "NovProg allows you to create a graph of your progress in writing a \
NaNoWriMo style novel. You enter your wordcount and it updates a graph \
showing you how much progress you have made. It also shows you how far you \
are through your daily goal, and your total goal. Mousing over a bar in the \
graph will show a tooltip with that day's wordcount."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.7"

RPM_NAME = "novprog-3.2.7-1.1.aarch64.rpm"
RPM_HASH = "850ffcfa93951c38ac301b01ee84a066088aea335af3da612d28885b5ee966005f5edecc5e0d11aaf896d6fb23034cbadf1e24e8e0df62da6a57b82b0dc4add0"

RPROVIDES:${PN} += "novprog"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
