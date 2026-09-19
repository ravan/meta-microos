SUMMARY = "Variable ties made easier: much, much, much easier.."
DESCRIPTION = "This module adds the ability to quickly create new types of tie objects \
without creating a complete class. It does so in such a way as to try and \
make the programmers life easier when it comes to single-use ties that I \
find myself wanting to use from time-to-time. \
 \
The 'Tie::Simple' package is actually a front-end to other classes which \
really do all the work once tied, but this package does the dwimming to \
automatically figure out what you're trying to do. \
 \
I've tried to make this as intuitive as possible and dependent on other \
bits of Perl where I can to minimize the need for documentation and to make \
this extra, extra spiffy."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-Tie-Simple-1.04-1.41.noarch.rpm"
RPM_HASH = "dacd6cb9e97c1763659b0374e21875c356b9b91fcf1adc7d1a17637d0077f01bf6874c9102a411bafaa0d2dc38b962a45f3abd9c9159d499ec2f0bf57f4e8e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Simple \
perl-Tie--Simple--Array \
perl-Tie--Simple--Handle \
perl-Tie--Simple--Hash \
perl-Tie--Simple--Scalar \
perl-Tie--Simple--Util \
perl-Tie-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
