SUMMARY = "Module of basic descriptive statistical functions"
DESCRIPTION = "This module provides basic functions used in descriptive statistics. It has \
an object oriented design and supports two different types of data storage \
and calculation objects: sparse and full. With the sparse method, none of \
the data is stored and only a few statistical measures are available. Using \
the full method, the entire data set is retained and additional functions \
are available. \
 \
Whenever a division by zero may occur, the denominator is checked to be \
greater than the value '$Statistics::Descriptive::Tolerance', which \
defaults to 0.0. You may want to change this value to some small positive \
value such as 1e-24 in order to obtain error messages in case of very small \
denominators. \
 \
Many of the methods (both Sparse and Full) cache values so that subsequent \
calls with the same arguments are faster."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0801"

RPM_NAME = "perl-Statistics-Descriptive-3.0801-1.16.noarch.rpm"
RPM_HASH = "ec045b917a5a5b95ccd72f553b6dcda6a16a7f6e7296fd411713e468c20a76d75d4f8061e6e6f6cf71f4136b0591e8b552322da9d8c65dd5495d366cef9253c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Statistics--Descriptive \
perl-Statistics--Descriptive--Full \
perl-Statistics--Descriptive--Smoother \
perl-Statistics--Descriptive--Smoother--Exponential \
perl-Statistics--Descriptive--Smoother--Weightedexponential \
perl-Statistics--Descriptive--Sparse \
perl-Statistics-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--MoreUtils \
perl-parent"

inherit rpm
