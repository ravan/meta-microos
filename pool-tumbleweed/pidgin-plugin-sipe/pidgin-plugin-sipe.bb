SUMMARY = "Pidgin protocol plugin to connect to MS Skype for Business"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. It implements the extended version of SIP/SIMPLE used by \
various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging. \
 \
With this plugin you should be able to replace your \
Skype for Business client with Pidgin. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "pidgin-plugin-sipe-1.25.0-4.8.noarch.rpm"
RPM_HASH = "209a1d41ec8246573f0d0cdbbdcbb502bfe79eab1af7d6ed0bc1c5b63ac24d98832560328c8248a8038d3522c990958be8c63e0f03d5f320c10296f8f245edd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-sipe \
pidgin-sipe"

RDEPENDS:${PN} += "libpurple-plugin-sipe \
pidgin"

inherit rpm
