SUMMARY = "Efficient resampling and calculation of medians with confidence intervals"
DESCRIPTION = "The purpose of this (XS) module is to calculate the median (or in principle \
also other statistics) with confidence intervals on a sample. To do that, \
it uses a technique called bootstrapping. In a nutshell, it resamples the \
sample a lot of times and for each resample, it calculates the median. From \
the distribution of medians, it then calculates the confidence limits. \
 \
In order to implement the confidence limit calculation, various other \
functions had to be implemented efficiently (both algorithmically efficient \
and done in C). These functions may be useful in their own right and are \
thus exposed to Perl. Most notably, this exposes a median (and general \
selection) algorithm that works in linear time as opposed to the trivial \
implementation that requires 'O(n*log(n))'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Statistics-CaseResampling-0.170.0-1.6.aarch64.rpm"
RPM_HASH = "8432ed42cdc76ef23315ca8bc1fae283235af0c3eb63d53d29a12b426fab02f48ec734f6142ad5fed38f55c2bed863763fa4fff7f2fa270ff6a582ac03c720bb"

RPROVIDES:${PN} += "perl-Statistics--CaseResampling \
perl-Statistics-CaseResampling"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
