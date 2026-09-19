SUMMARY = "Parse a domain down to root"
DESCRIPTION = "This module utilizes the 'effective_tld_names.dat' provided by Mozilla as a \
way to effectively reduce a fully qualified domain name down to the \
absolute root. The Mozilla PublicSuffix file is an open source, fully \
documented format that shows absolute root TLDs, primarily for Mozilla's \
browser products to be able to determine how far a cookie's security \
boundaries go. \
 \
This module will attempt to search etc directories in \
/usr/share/publicsuffix, /usr, /usr/local, and /opt/local for the \
effective_tld_names.dat file. If a file is not found, a default file is \
loaded from Domain::PublicSuffix::Default, which is current at the time of \
the module's release. You can override the data file path by giving the \
new() method a 'data_file' argument. \
 \
When creating a new PublicSuffix object, the module will load the data file \
as specified, and use the internal structure to parse each domain sent to \
the get_root_domain method. To re-parse the file, you must destroy and \
create a new object, or execute the _parse_data_file method directly, \
though that is not recommended."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.210.0"

RPM_NAME = "perl-Domain-PublicSuffix-0.210.0-1.10.noarch.rpm"
RPM_HASH = "3172faa98d7b399d75878a366d3fa3bbdda641eb95ebdd51dd8a93f4b444d4d115a588f53b9a828eb0893d238de04a36042634a4853fe7d7e00e2b436117cbcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Domain--PublicSuffix \
perl-Domain--PublicSuffix--Default \
perl-Domain-PublicSuffix"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Fast \
perl-Net--IDN--Encode \
perl-Test--More"

inherit rpm
