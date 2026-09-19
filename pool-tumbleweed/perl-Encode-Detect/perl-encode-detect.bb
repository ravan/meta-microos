SUMMARY = "An Encode::Encoding subclass that detects the encoding of data"
DESCRIPTION = "This Perl module is an Encode::Encoding subclass that uses \
Encode::Detect::Detector to determine the charset of the input data and then \
decodes it using the encoder of the detected charset. \
 \
It is similar to Encode::Guess, but does not require the configuration of a set \
of expected encodings. Like Encode::Guess, it only supports decoding--it cannot \
encode. \
 \
Authors: \
-------- \
    John Gardiner Myers <jgmyers@proofpoint.com>"
LICENSE = "MPL-1.1"

PV = "1.01"

RPM_NAME = "perl-Encode-Detect-1.01-21.55.aarch64.rpm"
RPM_HASH = "348dac9b5158c969bb25b626f35bfd6aeada98bd56e245e6837f6d074568237252bc9311a0b18fdbaf116522ed4cd40450380e9c3c74e23b2b914f0b876b6169"

RPROVIDES:${PN} += "perl-Encode--Detect \
perl-Encode--Detect--Detector \
perl-Encode-Detect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
