SUMMARY = "Decode morse code from PCM WAV files"
DESCRIPTION = "Experimental tool for decoding the morse codes from a PCM WAV file using a \
volume/peak based method. The tool can also decode the morse codes from text \
and RAW PCM files. It contains some options for parsing abbreviations, prosigns \
and qcodes."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "morse2ascii-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "9e0748d9d4f292128aa6b62319be45fbbfd5f9acda969fb7a7a529adeda1af88bfb18ca2412044dc5d80a1da2652b0e284e0a8f1a66a30176b5be80be564734b"

RPROVIDES:${PN} += "morse2ascii"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
