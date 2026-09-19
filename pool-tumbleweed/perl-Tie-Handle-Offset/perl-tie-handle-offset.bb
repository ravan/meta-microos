SUMMARY = "Tied handle that hides the beginning of a file"
DESCRIPTION = "This modules provides a file handle that hides the beginning of a file. \
After opening, the file is positioned at the offset location. 'seek()' and \
'tell()' calls are modified to preserve the offset. \
 \
For example, 'tell($fh)' will return 0, though the actual file position is \
at the offset. Likewise, 'seek($fh,80,0)' will seek to 80 bytes from the \
offset instead of 80 bytes from the actual start of the file."
LICENSE = "Apache-2.0"

PV = "0.004"

RPM_NAME = "perl-Tie-Handle-Offset-0.004-1.26.noarch.rpm"
RPM_HASH = "0634b8ba15d42ad1d4991f61349d249b362fd8e3e189745d94eefc99692bbc1603969205295fb27f8bc06d332b3a19005115220b6265d1615d88a0bef97aa832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Handle--Offset \
perl-Tie--Handle--SkipHeader \
perl-Tie-Handle-Offset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
