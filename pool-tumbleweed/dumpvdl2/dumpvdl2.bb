SUMMARY = "A VDL Mode 2 message decoder and protocol analyzer"
DESCRIPTION = "A VDL Mode 2 message decoder and protocol analyzer. \
 \
Features: \
 * Supports following SDR hardware: \
   - RTLSDR (via rtl-sdr library) \
   - Mirics SDR (via libmirisdr-4) \
   - reads prerecorded IQ data from file \
 * Decodes up to 8 VDL2 channels simultaneously \
 * Outputs messages to standard output or to a file (with optional daily \
   or hourly file rotation) \
 * Outputs ACARS messages to PlanePlotter over UDP/IP socket \
 * Supports message filtering by type or direction (uplink, downlink) \
 * Outputs decoding statistics using Etsy StatsD protocol"
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "dumpvdl2-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "94a60b08ea2bf48fa1d0cd6b76ea8b64edc3f8077cbe57744bfd8cf47f9838b44cbedb667c303de961cd3f5f215475418b1f0ff7884921c35accb132f2ba2c72"

RPROVIDES:${PN} += "dumpvdl2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libacars-2.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libmvec.so.1 \
libprotobuf-c.so.1 \
librtlsdr.so.0 \
libsqlite3.so.0 \
libzmq.so.5"

inherit rpm
