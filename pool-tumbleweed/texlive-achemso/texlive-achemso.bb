SUMMARY = "Support for American Chemical Society journal submissions"
DESCRIPTION = "The bundle provides a BibTeX style file following the \
requirements of the American Chemical Society (ACS), and a \
package to pass settings to the BibTeX style. It also includes \
a class which was used for submission support in the past. All \
of this material is largely of historical interest and is \
retained for stability. For new material, the chem-acs style is \
available for bibliographies, and a short template for the ACS \
website is better suited to submission."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn76790"

RPM_NAME = "texlive-achemso-2026.226.3.14svn76790-61.2.noarch.rpm"
RPM_HASH = "65fb11f1c44abd82823a55d0969b272fa5b743ac4748590dc2b3ceef9bab2a8c3a6d893f82fe7b594e03627899846e701acf24fc8360b55484800e23d8c07572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-achemso-aaembp.cfg \
tex-achemso-aaemcq.cfg \
tex-achemso-aamick.cfg \
tex-achemso-aanmf6.cfg \
tex-achemso-aapmcd.cfg \
tex-achemso-aastgj.cfg \
tex-achemso-abmcb8.cfg \
tex-achemso-abseba.cfg \
tex-achemso-acbcct.cfg \
tex-achemso-accacs.cfg \
tex-achemso-achre4.cfg \
tex-achemso-acncdm.cfg \
tex-achemso-acsccc.cfg \
tex-achemso-acscii.cfg \
tex-achemso-acsodf.cfg \
tex-achemso-aeacb3.cfg \
tex-achemso-aeacc4.cfg \
tex-achemso-aeecco.cfg \
tex-achemso-aelccp.cfg \
tex-achemso-aesccq.cfg \
tex-achemso-aewcaa.cfg \
tex-achemso-afsthl.cfg \
tex-achemso-aidcbc.cfg \
tex-achemso-amacgu.cfg \
tex-achemso-amachv.cfg \
tex-achemso-amclct.cfg \
tex-achemso-amlccd.cfg \
tex-achemso-amlcef.cfg \
tex-achemso-amrcda.cfg \
tex-achemso-anaccx.cfg \
tex-achemso-ancac3.cfg \
tex-achemso-ancham.cfg \
tex-achemso-anmafm.cfg \
tex-achemso-aoiab5.cfg \
tex-achemso-apcach.cfg \
tex-achemso-apchd5.cfg \
tex-achemso-appccd.cfg \
tex-achemso-asbcd6.cfg \
tex-achemso-ascecg.cfg \
tex-achemso-ascefj.cfg \
tex-achemso-bcches.cfg \
tex-achemso-bichaw.cfg \
tex-achemso-bomaf6.cfg \
tex-achemso-cgdefu.cfg \
tex-achemso-chreay.cfg \
tex-achemso-cmatex.cfg \
tex-achemso-crtoec.cfg \
tex-achemso-enfuem.cfg \
tex-achemso-esthag.cfg \
tex-achemso-estlcu.cfg \
tex-achemso-iecred.cfg \
tex-achemso-inoraj.cfg \
tex-achemso-jaaucr.cfg \
tex-achemso-jacsat.cfg \
tex-achemso-jafcau.cfg \
tex-achemso-jceaax.cfg \
tex-achemso-jceda8.cfg \
tex-achemso-jcisd8.cfg \
tex-achemso-jctcce.cfg \
tex-achemso-jmcmar.cfg \
tex-achemso-jnprdf.cfg \
tex-achemso-joceah.cfg \
tex-achemso-jpcafh.cfg \
tex-achemso-jpcbfk.cfg \
tex-achemso-jpccck.cfg \
tex-achemso-jpclcd.cfg \
tex-achemso-jprobs.cfg \
tex-achemso-langd5.cfg \
tex-achemso-mamobx.cfg \
tex-achemso-mpohbp.cfg \
tex-achemso-nalefd.cfg \
tex-achemso-oprdfk.cfg \
tex-achemso-orgnd7.cfg \
tex-achemso-orlef7.cfg \
tex-achemso.cls \
tex-achemso.sty \
tex-natmove.sty \
texlive-achemso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-mciteplus.sty \
tex-natbib.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
